/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.documentofisico;

import it.iccu.sbn.ejb.exception.ApplicationException;
import it.iccu.sbn.ejb.exception.DataException;
import it.iccu.sbn.ejb.exception.ResourceNotFoundException;
import it.iccu.sbn.ejb.exception.ValidationException;
import it.iccu.sbn.ejb.vo.documentofisico.AggDispVO;
import it.iccu.sbn.ejb.vo.documentofisico.ScaricoInventarialeVO;
import it.iccu.sbn.ejb.vo.documentofisico.SpostamentoCollocazioniVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.AcquisizioneUriCopiaDigitaleVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.ElaborazioniDifferiteOutputVo;
import it.iccu.sbn.ejb.vo.gestionebibliografica.AreaParametriStampaSchedeVo;
import it.iccu.sbn.servizi.batch.BatchLogWriter;
import it.iccu.sbn.vo.custom.esporta.QueryData;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Remote interface for ServiziDocumentoFisico.
 * @generated
 * @wtp generated
 */
public interface DocumentoFisicoBMT
   extends javax.ejb.EJBObject
   {
	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws DataException
	 * @throws ApplicationException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public boolean getFusioneTitoli( java.lang.String bidOld,java.lang.String bidNew,java.lang.String firmaUtente )
	throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws DataException
	 * @throws ApplicationException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public SpostamentoCollocazioniVO getSpostamentoCollocazioni(SpostamentoCollocazioniVO input,  BatchLogWriter log)
	throws ResourceNotFoundException, ApplicationException, ValidationException, DataException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws DataException
	 * @throws ApplicationException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public AggDispVO getAggiornamentoDisponibilita(AggDispVO input,  BatchLogWriter log)
	throws ResourceNotFoundException, ApplicationException, ValidationException, DataException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws DataException
	 * @throws ApplicationException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public ScaricoInventarialeVO getScaricoInventariale(ScaricoInventarialeVO input,  BatchLogWriter log)
	throws ResourceNotFoundException, ApplicationException, ValidationException, DataException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws ResourceNotFoundException
	 * @throws ApplicationException
	 * @throws RemoteException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public java.util.List getBid( AreaParametriStampaSchedeVo input,java.lang.String tipoOperazione,java.lang.String ticket)
	throws it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, it.iccu.sbn.ejb.exception.DataException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws ResourceNotFoundException
	 * @throws ApplicationException
	 * @throws RemoteException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public java.util.List getBid2( AreaParametriStampaSchedeVo input,java.lang.String tipoOperazione,java.lang.String ticket)
	throws it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, it.iccu.sbn.ejb.exception.DataException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws RemoteException
	 * @throws ApplicationException
	 * @throws DataException
	 * @throws ValidationException
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public java.util.List getSegnature( java.lang.String codPolo,java.lang.String codBib,java.lang.String bid,java.lang.String ticket )
	throws it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;


	// -- IMPORT UNIMARC
	// -- da Inventario.java e Collocazione.java

//	/**
//	 * <!-- begin-xdoclet-definition -->
//	 * @throws DataException
//	 * @throws ApplicationException
//	 * @throws ValidationException
//	 * @generated //TODO: Must provide implementation for bean create stub    */
//	public it.iccu.sbn.ejb.vo.documentofisico.SerieVO getSerieDettaglioUnimarc( java.lang.String codPolo,java.lang.String codBib,java.lang.String codSerie,java.lang.String ticket )
//	throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//	/**
//	 * <!-- begin-xdoclet-definition -->
//	 * @throws DataException
//	 * @throws ApplicationException
//	 * @throws ValidationException
//	 * @generated //TODO: Must provide implementation for bean create stub    */
//	public boolean insertSerieUnimarc( it.iccu.sbn.ejb.vo.documentofisico.SerieVO serie,java.lang.String ticket )
//	throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//	/**
//	 * <!-- begin-xdoclet-definition -->
//	 * @throws DataException
//	 * @throws ApplicationException
//	 * @throws ValidationException
//	 * @generated //TODO: Must provide implementation for bean create stub    */
//	public java.util.List insertInventarioUnimarc( it.iccu.sbn.ejb.vo.documentofisico.InventarioVO inventario,java.lang.String tipoOperazione,int nInv,java.util.Locale locale,java.lang.String ticket )
//	throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//	/**
//	 * <!-- begin-xdoclet-definition -->
//	 * @throws DataException
//	 * @throws ApplicationException
//	 * @throws ValidationException
//	 * @generated //TODO: Must provide implementation for bean create stub    */
//	public it.iccu.sbn.ejb.vo.documentofisico.InventarioVO getInventarioUnimarc( java.lang.String codPolo,java.lang.String codBib,java.lang.String codSerie,int codInv,java.util.Locale locale,java.lang.String ticket )
//	throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, it.iccu.sbn.persistence.dao.exception.DaoManagerException, java.rmi.RemoteException;
//
//	/**
//	 * <!-- begin-xdoclet-definition -->
//	 * @throws ResourceNotFoundException
//	 * @throws ApplicationException
//	 * @throws RemoteException
//	 * @throws ValidationException
//	 * @generated //TODO: Must provide implementation for bean create stub    */
//	public int updateInvCollUnimarc( it.iccu.sbn.ejb.vo.documentofisico.InventarioVO recInvColl,it.iccu.sbn.ejb.vo.documentofisico.CollocazioneVO recColl,java.lang.String tipoOperazione,java.lang.String ticket )
//	throws it.iccu.sbn.ejb.exception.ResourceNotFoundException, it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//   /**
//    * <!-- begin-xdoclet-definition -->
//    * @throws ResourceNotFoundException
//    * @throws DataException
//    * @throws ValidationException
//    * @generated //TODO: Must provide implementation for bean create stub    */
//   public boolean insertSezioneUnimarc( it.iccu.sbn.ejb.vo.documentofisico.SezioneCollocazioneVO sezione,java.lang.String ticket )
//      throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//   /**
//    * <!-- begin-xdoclet-definition -->
//    * @throws ResourceNotFoundException
//    * @throws DataException
//    * @throws ValidationException
//    * @generated //TODO: Must provide implementation for bean create stub    */
//   public it.iccu.sbn.ejb.vo.documentofisico.SezioneCollocazioneVO getSezioneDettaglioUnimarc( java.lang.String codPolo,java.lang.String codBib,java.lang.String codSez,java.lang.String ticket )
//      throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;
//
//   /**
//    * <!-- begin-xdoclet-definition -->
//    * @throws DataException
//    * @throws ApplicationException
//    * @throws ValidationException
//    * @generated //TODO: Must provide implementation for bean create stub    */
//   public it.iccu.sbn.ejb.vo.documentofisico.CollocazioneVO getCollocazioneUnimarc( int keyLoc,java.lang.String ticket )
//      throws it.iccu.sbn.ejb.exception.DataException, it.iccu.sbn.ejb.exception.ApplicationException, it.iccu.sbn.ejb.exception.ValidationException, java.rmi.RemoteException;

	/**
	 * <!-- begin-xdoclet-definition -->
	 * @throws Exception
	 * @generated //TODO: Must provide implementation for bean create stub    */
	public void executeInsertUpdateImport(List<QueryData> queryData)
	throws java.rmi.RemoteException;

	//almaviva5_20130916 evolutive google2
	public ElaborazioniDifferiteOutputVo acquisizioneUriCopiaDigitale(
			AcquisizioneUriCopiaDigitaleVO richiesta, BatchLogWriter blog) throws ApplicationException, ValidationException, RemoteException;

}
