/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: almaviva
 * License Type: Purchased
 */
package it.finsiel.sbn.polo.orm.viste;

import it.finsiel.sbn.polo.orm.KeyParameter;
/**
 * ORM-Persistable Class
 */
public class Vl_cartografia_aut extends V_cartografia {

	private static final long serialVersionUID = 1932563921984923976L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Vl_cartografia_aut))
			return false;
		Vl_cartografia_aut vl_cartografia_aut = (Vl_cartografia_aut)aObj;
		if (getVID() != null && !getVID().equals(vl_cartografia_aut.getVID()))
			return false;
		if (getBID() != null && !getBID().equals(vl_cartografia_aut.getBID()))
			return false;
		if (getCD_RELAZIONE() != null && !getCD_RELAZIONE().equals(vl_cartografia_aut.getCD_RELAZIONE()))
			return false;
		if (getTP_RESPONSABILITA() != vl_cartografia_aut.getTP_RESPONSABILITA())
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + getVID().hashCode();
		hashcode = hashcode + getBID().hashCode();
		hashcode = hashcode + getCD_RELAZIONE().hashCode();
		hashcode = hashcode + getTP_RESPONSABILITA().hashCode();
		return hashcode;
	}

	private String VID;

	private String CD_RELAZIONE;

	private String TP_RESPONSABILITA;

	private String NOTA_TIT_AUT;

	private String FL_INCERTO;

	private String FL_SUPERFLUO;

	private String CD_STRUMENTO_MUS;

	private String CD_LIVELLO_C;

	private String TP_PUBB_GOV;

	private String CD_COLORE;

	private String CD_MERIDIANO;

	private String CD_SUPPORTO_FISICO;

	private String CD_TECNICA;

	private String CD_FORMA_RIPR;

	private String CD_FORMA_PUBB;

	private String CD_ALTITUDINE;

	private String CD_TIPOSCALA;

	private String TP_SCALA;

	private String SCALA_ORIZ;

	private String SCALA_VERT;

	private String LONGITUDINE_OVEST;

	private String LONGITUDINE_EST;

	private String LATITUDINE_NORD;

	private String LATITUDINE_SUD;

	private String TP_IMMAGINE;

	private String CD_FORMA_CART;

	private String CD_PIATTAFORMA;

	private String CD_CATEG_SATELLITE;

	private String FL_CONDIVISO;

	private String UTE_CONDIVISO;

	private java.util.Date TS_CONDIVISO;

	private String FL_CONDIVISO_LEGAME;

	private String UTE_CONDIVISO_LEGAME;

	private java.util.Date TS_CONDIVISO_LEGAME;

	public String getFL_CONDIVISO() {
		return FL_CONDIVISO;
	}

	public java.util.Date getTS_CONDIVISO() {
		return TS_CONDIVISO;
	}

	public String getUTE_CONDIVISO() {
		return UTE_CONDIVISO;
	}

	public void setFL_CONDIVISO(String value) {
		this.FL_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXfl_condiviso, value);
	}

	public void setTS_CONDIVISO(java.util.Date value) {
		this.TS_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXts_condiviso, value);
	}

	public void setUTE_CONDIVISO(String value) {
		this.UTE_CONDIVISO = value;
		this.settaParametro(KeyParameter.XXXute_condiviso, value);
	}

	public String getFL_CONDIVISO_LEGAME() {
		return FL_CONDIVISO_LEGAME;
	}

	public java.util.Date getTS_CONDIVISO_LEGAME() {
		return TS_CONDIVISO_LEGAME;
	}

	public String getUTE_CONDIVISO_LEGAME() {
		return UTE_CONDIVISO_LEGAME;
	}

	public void setFL_CONDIVISO_LEGAME(String value) {
		this.FL_CONDIVISO_LEGAME = value;
		this.settaParametro(KeyParameter.XXXfl_condiviso_legame, value);
	}

	public void setTS_CONDIVISO_LEGAME(java.util.Date value) {
		this.TS_CONDIVISO_LEGAME = value;
		this.settaParametro(KeyParameter.XXXts_condiviso_legame, value);
	}

	public void setUTE_CONDIVISO_LEGAME(String value) {
		this.UTE_CONDIVISO_LEGAME = value;
		this.settaParametro(KeyParameter.XXXute_condiviso_legame, value);
	}





	public void setVID(String value) {
		this.VID = value;
    this.settaParametro(KeyParameter.XXXvid,value);
	}

	public String getVID() {
		return VID;
	}

	public void setCD_RELAZIONE(String value) {
		this.CD_RELAZIONE = value;
    this.settaParametro(KeyParameter.XXXcd_relazione,value);
	}

	public String getCD_RELAZIONE() {
		return CD_RELAZIONE;
	}

	public void setTP_RESPONSABILITA(String value) {
		this.TP_RESPONSABILITA = value;
    this.settaParametro(KeyParameter.XXXtp_responsabilita,value);
	}

	public String getTP_RESPONSABILITA() {
		return TP_RESPONSABILITA;
	}

	public void setNOTA_TIT_AUT(String value) {
		this.NOTA_TIT_AUT = value;
    this.settaParametro(KeyParameter.XXXnota_tit_aut,value);
	}

	public String getNOTA_TIT_AUT() {
		return NOTA_TIT_AUT;
	}

	public void setFL_INCERTO(String value) {
		this.FL_INCERTO = value;
    this.settaParametro(KeyParameter.XXXfl_incerto,value);
	}

	public String getFL_INCERTO() {
		return FL_INCERTO;
	}

	public void setFL_SUPERFLUO(String value) {
		this.FL_SUPERFLUO = value;
    this.settaParametro(KeyParameter.XXXfl_superfluo,value);
	}

	public String getFL_SUPERFLUO() {
		return FL_SUPERFLUO;
	}

	public void setCD_STRUMENTO_MUS(String value) {
		this.CD_STRUMENTO_MUS = value;
    this.settaParametro(KeyParameter.XXXcd_strumento_mus,value);
	}

	public String getCD_STRUMENTO_MUS() {
		return CD_STRUMENTO_MUS;
	}

	public void setCD_LIVELLO_C(String value) {
		this.CD_LIVELLO_C = value;
    this.settaParametro(KeyParameter.XXXcd_livello_c,value);
	}

	public String getCD_LIVELLO_C() {
		return CD_LIVELLO_C;
	}

	public void setTP_PUBB_GOV(String value) {
		this.TP_PUBB_GOV = value;
    this.settaParametro(KeyParameter.XXXtp_pubb_gov,value);
	}

	public String getTP_PUBB_GOV() {
		return TP_PUBB_GOV;
	}

	public void setCD_COLORE(String value) {
		this.CD_COLORE = value;
    this.settaParametro(KeyParameter.XXXcd_colore,value);
	}

	public String getCD_COLORE() {
		return CD_COLORE;
	}

	public void setCD_MERIDIANO(String value) {
		this.CD_MERIDIANO = value;
    this.settaParametro(KeyParameter.XXXcd_meridiano,value);
	}

	public String getCD_MERIDIANO() {
		return CD_MERIDIANO;
	}

	public void setCD_SUPPORTO_FISICO(String value) {
		this.CD_SUPPORTO_FISICO = value;
    this.settaParametro(KeyParameter.XXXcd_supporto_fisico,value);
	}

	public String getCD_SUPPORTO_FISICO() {
		return CD_SUPPORTO_FISICO;
	}

	public void setCD_TECNICA(String value) {
		this.CD_TECNICA = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica,value);
	}

	public String getCD_TECNICA() {
		return CD_TECNICA;
	}

	public void setCD_FORMA_RIPR(String value) {
		this.CD_FORMA_RIPR = value;
    this.settaParametro(KeyParameter.XXXcd_forma_ripr,value);
	}

	public String getCD_FORMA_RIPR() {
		return CD_FORMA_RIPR;
	}

	public void setCD_FORMA_PUBB(String value) {
		this.CD_FORMA_PUBB = value;
    this.settaParametro(KeyParameter.XXXcd_forma_pubb,value);
	}

	public String getCD_FORMA_PUBB() {
		return CD_FORMA_PUBB;
	}

	public void setCD_ALTITUDINE(String value) {
		this.CD_ALTITUDINE = value;
    this.settaParametro(KeyParameter.XXXcd_altitudine,value);
	}

	public String getCD_ALTITUDINE() {
		return CD_ALTITUDINE;
	}

	public void setCD_TIPOSCALA(String value) {
		this.CD_TIPOSCALA = value;
    this.settaParametro(KeyParameter.XXXcd_tiposcala,value);
	}

	public String getCD_TIPOSCALA() {
		return CD_TIPOSCALA;
	}

	public void setTP_SCALA(String value) {
		this.TP_SCALA = value;
    this.settaParametro(KeyParameter.XXXtp_scala,value);
	}

	public String getTP_SCALA() {
		return TP_SCALA;
	}

	public void setSCALA_ORIZ(String value) {
		this.SCALA_ORIZ = value;
    this.settaParametro(KeyParameter.XXXscala_oriz,value);
	}

	public String getSCALA_ORIZ() {
		return SCALA_ORIZ;
	}

	public void setSCALA_VERT(String value) {
		this.SCALA_VERT = value;
    this.settaParametro(KeyParameter.XXXscala_vert,value);
	}

	public String getSCALA_VERT() {
		return SCALA_VERT;
	}

	public void setLONGITUDINE_OVEST(String value) {
		this.LONGITUDINE_OVEST = value;
    this.settaParametro(KeyParameter.XXXlongitudine_ovest,value);
	}

	public String getLONGITUDINE_OVEST() {
		return LONGITUDINE_OVEST;
	}

	public void setLONGITUDINE_EST(String value) {
		this.LONGITUDINE_EST = value;
    this.settaParametro(KeyParameter.XXXlongitudine_est,value);
	}

	public String getLONGITUDINE_EST() {
		return LONGITUDINE_EST;
	}

	public void setLATITUDINE_NORD(String value) {
		this.LATITUDINE_NORD = value;
    this.settaParametro(KeyParameter.XXXlatitudine_nord,value);
	}

	public String getLATITUDINE_NORD() {
		return LATITUDINE_NORD;
	}

	public void setLATITUDINE_SUD(String value) {
		this.LATITUDINE_SUD = value;
    this.settaParametro(KeyParameter.XXXlatitudine_sud,value);
	}

	public String getLATITUDINE_SUD() {
		return LATITUDINE_SUD;
	}

	public void setTP_IMMAGINE(String value) {
		this.TP_IMMAGINE = value;
    this.settaParametro(KeyParameter.XXXtp_immagine,value);
	}

	public String getTP_IMMAGINE() {
		return TP_IMMAGINE;
	}

	public void setCD_FORMA_CART(String value) {
		this.CD_FORMA_CART = value;
    this.settaParametro(KeyParameter.XXXcd_forma_cart,value);
	}

	public String getCD_FORMA_CART() {
		return CD_FORMA_CART;
	}

	public void setCD_PIATTAFORMA(String value) {
		this.CD_PIATTAFORMA = value;
    this.settaParametro(KeyParameter.XXXcd_piattaforma,value);
	}

	public String getCD_PIATTAFORMA() {
		return CD_PIATTAFORMA;
	}

	public void setCD_CATEG_SATELLITE(String value) {
		this.CD_CATEG_SATELLITE = value;
    this.settaParametro(KeyParameter.XXXcd_categ_satellite,value);
	}


 public String getCD_CATEG_SATELLITE() {
		return CD_CATEG_SATELLITE;
	}

	public String toString() {
		return String.valueOf(getVID() + " " + getBID() + " " + getCD_RELAZIONE() + " " + getTP_RESPONSABILITA());
	}

}
