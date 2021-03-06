<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean-struts"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>

<bean-struts:define id="noinput"  value="false"/>

<c:choose>
<c:when test="${inserisciProfiloForm.disabilitaTutto}">
	<bean-struts:define id="noinput"  value="true"/>
</c:when>
</c:choose>

<html:xhtml />
<layout:page>
	<sbn:navform action="/acquisizioni/profiliacquisto/inserisciProfilo.do" method="post">
  <div id="divForm">
	<div id="divMessaggio"><sbn:errors /></div>
		<table   width="100%" border="0">
		     <tr>
                        <td  width="10%" scope="col" class="etichetta" align="left">
	                   	<bean:message  key="ricerca.label.codiceBibl" bundle="acquisizioniLabels" />
                        </td>
                        <td scope="col" align="left">
						<html:text styleId="testoNormale" property="datiProfilo.codBibl" size="3" readonly="true"></html:text>
	                        <html:submit title="elenco" styleClass="buttonImageListaSezione" property="methodInserisciProfilo" disabled="${noinput}" >
								<bean:message  key="ricerca.label.bibliolist" bundle="acquisizioniLabels" />
							</html:submit>
                        </td>
             </tr>

		     <tr>
 						<td  class="etichetta" width="10%" scope="col" align="left">
	                   	<bean:message  key="ricerca.label.profilo" bundle="acquisizioniLabels" />
 						</td>
                        <td  scope="col" align="left">
						<html:text styleId="testoNormale" name="inserisciProfiloForm" property="datiProfilo.profilo.codice" size="5" readonly="true"></html:text>
                        </td>
						<td  class="etichetta"  scope="col" align="left">
	                   	<bean:message  key="ricerca.label.descrizione" bundle="acquisizioniLabels" />
						</td>
                        <td  scope="col" align="left">
						<html:text styleId="testoNormale"  name="inserisciProfiloForm" property="datiProfilo.profilo.descrizione" size="20"  maxlength="20" readonly="${noinput}" ></html:text>
                        </td>
						<td  class="etichetta"  scope="col"><div align="left">
	                   	<bean:message  key="ordine.label.sezione" bundle="acquisizioniLabels" />
						</td>
                        <td  scope="col" align="left">
						<html:text  styleId="testoNormale" name="inserisciProfiloForm" property="datiProfilo.sezione.codice" size="7" readonly="true"></html:text>
                        <html:submit  styleClass="buttonImageListaSezione" property="methodInserisciProfilo" disabled="${noinput}">
							<bean:message  key="ricerca.label.sezione" bundle="acquisizioniLabels" />
						</html:submit>
                        </td>
                        <td  align="left" scope="col">
                        </td>
			</tr>

		     <tr>
						<td  class="etichetta"  scope="col" align="left">
	                   	<bean:message  key="ricerca.label.lingua" bundle="acquisizioniLabels" />
						</td>
                        <td scope="col" align="left">
							<html:select name="inserisciProfiloForm"  style="width:60px;" styleClass="testoNormale"  property="datiProfilo.lingua.codice" disabled="${noinput}">
							<html:optionsCollection  property="listaLingue" value="codice" label="descrizioneCodice" />
							</html:select>
                        </td>

						<td  class="etichetta"  scope="col" align="left">
	                   	<bean:message  key="ricerca.label.paese" bundle="acquisizioniLabels" />
						</td>
                        <td scope="col" align="left">
							<html:select name="inserisciProfiloForm"   styleClass="testoNormale"  property="datiProfilo.paese.codice" disabled="${noinput}">
							<html:optionsCollection  property="listaPaesi" value="codice" label="descrizione" />
							</html:select>
                        </td>

			</tr>
		     <tr>
				<td  colspan="7"  class="etichetta"   scope="col" align="center">
                &nbsp;
				</td>
			</tr>

		     <tr>
						<td  colspan="7" class="etichettaIntestazione"  align="center" scope="col">
	                   	<bean:message  key="ricerca.label.totFornitori" bundle="acquisizioniLabels" />
						</td>
			</tr>
  		    </table>
			<br>
			<table align="center" width="95%" style="border-color: #5A96DF;	border-style: dotted; border-width: 1px;" >

		  	<tr class="etichetta" bgcolor="#dde8f0">
		  	<!--
				<td  class="etichetta" scope="col" align="center" style="width: 1%;">
           			<bean:message  key="ricerca.label.numRiga" bundle="acquisizioniLabels" />
				</td>
			-->
				<td  class="etichetta"  width="10%" scope="col" align="center">
                   	<bean:message  key="ricerca.label.codice" bundle="acquisizioniLabels" />
				</td>
				<td  class="etichetta"  scope="col" align="center">
                   	<bean:message  key="ricerca.label.descrizione" bundle="acquisizioniLabels" />
				</td>
				<td  class="etichetta" width="5%" colspan="2"  scope="col" align="center">
                &nbsp;
				</td>

			</tr>

			<logic:greaterThan name="inserisciProfiloForm" property="numForn" value="0">
				<logic:iterate id="elencaFornitori" property="elencaFornitori" name="inserisciProfiloForm" indexId="indice">
				   <c:set var="color" >
						<c:choose>
					        <c:when test='${color == "#FFCC99"}'>
					            #FEF1E2
					        </c:when>
					        <c:otherwise>
								#FFCC99
					        </c:otherwise>
					    </c:choose>
				    </c:set>

					<logic:notEqual  name="elencaFornitori" property="codice2" value="">
					  	<tr class="testoNormale" bgcolor="${color}">
					  	<!--
							<td  class="testoNormale" align="center">
								<bean-struts:write  name="elencaFornitori"  property="codice1"/>
							</td>
						-->
							<td  class="testoNormale" align="center">
								<bean-struts:write   name="elencaFornitori" property="codice2"/>
							</td>
							<td  class="testoNormale" align="center">
								<bean-struts:write   name="elencaFornitori" property="codice3"/>
							</td>
							<bean-struts:define id="operazioneValue">
							  <bean-struts:write  name="indice" />
							</bean-struts:define>

							<td  class="testoNormale" align="center">
								<html:radio property="radioForn" value="${operazioneValue}"></html:radio>
							</td>
						</tr>

					</logic:notEqual>

					<!-- controllo se � stato selezionata l'operazione di inserimento riga -->
					<logic:equal  name="elencaFornitori" property="codice2" value="">
						<tr class="testoNormale" bgcolor="${color}">
							<td align="center">
								<html:text styleId="testoNormale" indexed="true" name="elencaFornitori" property="codice1" size="2" readonly="true" ></html:text>
							</td>
							<td align="center">
								<html:text styleId="testoNormale" indexed="true" name="elencaFornitori" property="codice2" size="4" readonly="${noinput}" ></html:text>
							</td>
							<td align="center">
								<html:text styleId="testoNormale" indexed="true" name="elencaFornitori" property="codice3" size="50"  readonly="true" ></html:text>
							</td>
							<bean-struts:define id="operazioneValue">
							  <bean-struts:write  name="indice" />
							</bean-struts:define>
							<td  class="testoNormale" align="center">
								<html:radio property="radioForn" value="${operazioneValue}"></html:radio>
							</td>
						</tr>


					</logic:equal>
			</logic:iterate>
		</logic:greaterThan>
		<!--
			<tr>
				<td  class="etichetta" scope="col" align="center">
				<input class="testoNormale" name="Codice" type="text" size="2" value=""  >
				</td>
				<td  class="testoNormale"  scope="col" align="left">&nbsp;</td>
				<td  width="5%"  scope="col" align="center">
				<input class="testoNormale" type="Radio" name="check1" >
				</td>
			</tr>
   		-->

    		</table>
    		 <br><br>
 </div>

  <div id="divFooter">
		<c:choose>
			<c:when test="${inserisciProfiloForm.conferma}">
				<jsp:include page="/WEB-INF/jsp/subpages/acquisizioni/utility/confermaOperazione.jsp" />
			</c:when>
			<c:otherwise>

			<!-- tabella bottoni -->
           <table align="center"  border="0" style="height:40px" >
            <tr>
             <td >

						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.salva" bundle="acquisizioniLabels" />
						</html:submit>
						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.ripristina" bundle="acquisizioniLabels" />
						</html:submit>
						<!--
						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.insRiga" bundle="acquisizioniLabels" />
						</html:submit>
						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.cancRiga" bundle="acquisizioniLabels" />
						</html:submit>
						-->
						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.insForn" bundle="acquisizioniLabels" />
						</html:submit>
						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.cancForn" bundle="acquisizioniLabels" />
						</html:submit>

						<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.cancella" bundle="acquisizioniLabels" />
						</html:submit>
						<!--
			 			<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.label.fornitori" bundle="acquisizioniLabels" />
						</html:submit>
			 			-->
			 			<html:submit styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.indietro" bundle="acquisizioniLabels" />
						</html:submit>
					<logic:equal  name="inserisciProfiloForm" property="visibilitaIndietroLS" value="true">
						<html:submit  styleClass="pulsanti" property="methodInserisciProfilo">
							<bean:message key="ricerca.button.scegli" bundle="acquisizioniLabels" />
						</html:submit>
					</logic:equal>

             </td>
             </tr>
      	  </table>
	  			<!-- fine tabella bottoni -->
    		</c:otherwise>
		</c:choose>
	  			<!-- fine tabella bottoni -->
     	  </div>
	</sbn:navform>
</layout:page>
