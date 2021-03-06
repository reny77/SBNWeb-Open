/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.amministrazione;

import it.iccu.sbn.ejb.exception.ApplicationException;
import it.iccu.sbn.ejb.exception.DataException;
import it.iccu.sbn.ejb.exception.ResourceNotFoundException;
import it.iccu.sbn.ejb.exception.ValidationException;
import it.iccu.sbn.ejb.vo.amministrazionesistema.BibliotecaRicercaVO;
import it.iccu.sbn.ejb.vo.amministrazionesistema.BibliotecaVO;
import it.iccu.sbn.ejb.vo.amministrazionesistema.custom.BibliotecaSearch;
import it.iccu.sbn.ejb.vo.amministrazionesistema.profilazionepolo.GruppoParametriVO;
import it.iccu.sbn.ejb.vo.common.ComboVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.esporta.EsportaVO;
import it.iccu.sbn.ejb.vo.gestionestampe.common.StampaType;
import it.iccu.sbn.ejb.vo.gestionestampe.common.StampeOnlineVO;
import it.iccu.sbn.persistence.dao.exception.DaoManagerException;
import it.iccu.sbn.servizi.batch.BatchLogWriter;
import it.iccu.sbn.vo.custom.amministrazione.OrderedTreeElement;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Remote interface for AmministrazioneBiblioteca.
 *
 * @generated
 * @wtp generated
 */
public interface AmministrazioneBiblioteca extends javax.ejb.EJBObject {
	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public void createBiblioteca(java.lang.String cd_polo,
			it.iccu.sbn.vo.custom.Biblioteca biblioteca)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public void updateBiblioteca(java.lang.String cd_polo,
			it.iccu.sbn.vo.custom.Biblioteca biblioteca)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public void updateBiblioteca(BibliotecaVO bibliotecaVO) throws ApplicationException, RemoteException;


	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public void getAttivitaBibliotecario(int id_bibliotecario)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public it.iccu.sbn.ejb.model.unimarcmodel.SbnUserType getUserSbnMarc(
			java.lang.String ticket)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public java.util.List getAllBiblioteche(java.lang.String cd_polo)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public List<BibliotecaVO> getListaBibliotecheAffiliatePerAttivita(String codPolo, String codBib, String codAttivita, boolean mostraBibCorrente)
		throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
		java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public java.util.List getComboBibliotecheSBN()
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 *
	 * @throws DaoManagerException
	 * @generated //TODO: Must provide implementation for bean method stub
	 */
	public java.util.List getBiblioteche(BibliotecaSearch search)
			throws it.iccu.sbn.persistence.dao.exception.DaoManagerException,
			java.rmi.RemoteException;


	public StampeOnlineVO stampeOnline(String ticket, StampaType tipoStampa,
			List parametri) throws RemoteException, ApplicationException, DaoManagerException,
			DataException, ValidationException ;

	public List stampaListaBiblioteche(String ticket, List parametri)
	throws ResourceNotFoundException, ApplicationException, DaoManagerException, RemoteException ;

	public OrderedTreeElement getElencoAttivita(java.lang.String ticket)
	throws DaoManagerException, RemoteException;

	public List<ComboVO> getElencoBiblioteche()
	throws DaoManagerException, RemoteException;

	public List getElencoParametri(String codBib)
	throws DaoManagerException, RemoteException;

	public String[] getElencoAttivitaProfilo(String codBib)
	throws DaoManagerException, RemoteException;

	public int setProfiloBiblioteca(String codiceBib, String codiceUtente,
			  List<String> elencoAttivita,
			  List<GruppoParametriVO> elencoAuthorities,
			  List<GruppoParametriVO> elencoMateriali,
			  List<GruppoParametriVO> elencoSemantica) throws DaoManagerException, DataException, RemoteException;

	public List<String> controllaAttivita(String codBib, List<String> elencoAttivita)
	throws DaoManagerException, RemoteException;

	public List<BibliotecaVO> cercaBiblioteche(String ticket, BibliotecaRicercaVO richiesta)
	throws DaoManagerException, RemoteException;

    public List<BibliotecaVO> getBibliotecheCentroSistema()
    throws DaoManagerException, RemoteException;

    public String getCodicePoloCorrente()
    throws DaoManagerException, RemoteException;

	public BibliotecaVO creaBiblioteca(BibliotecaVO biblioteca, String utenteInseritore, boolean forzaInserimento, boolean abilitazione, String codPoloCorrente)
	throws DaoManagerException, ApplicationException, RemoteException;

	public BibliotecaVO caricaBiblioteca(int idBiblioteca)
	throws DaoManagerException, RemoteException;

	public boolean controllaAbilitazioneBiblioteca(int idBib)
	throws DaoManagerException, RemoteException;

	public List<BibliotecaVO> getListaBibliotechePolo(String codPolo) throws DaoManagerException, RemoteException;

    public List<String> getElencoModelli()
    throws DaoManagerException, RemoteException;

    public List getElencoParametriModello(String nomeModello)
  	throws DaoManagerException, RemoteException;

    public String[] getElencoAttivitaProfiloModello(String idModello)
	throws DaoManagerException, RemoteException;

    public boolean isCentroSistema(String polo, String bib)
	throws DaoManagerException, RemoteException;

	public BibliotecaVO getBiblioteca(String codPolo, String codBib) throws DaoManagerException, RemoteException;

	public List<BibliotecaVO> getListaBibliotecheSistemaMetropolitano(
			String codPolo, String codBib) throws DaoManagerException,
			RemoteException;

	public List<BibliotecaVO> getListaBibliotecheAteneoInPolo(String codPolo, String ateneo) throws DaoManagerException, RemoteException;

	public long export(EsportaVO esporta, String filePathName, BatchLogWriter batchLog) throws ValidationException, RemoteException;

}