/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.stampe;

/**
 * Home interface for RegistriIngresso.
 * @generated
 * @wtp generated
 */
public interface SBNStampeBuoniCaricoHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/SBNStampeBuoniCaricoOnLine";
   public static final String JNDI_NAME="sbnWeb/SBNStampeBuoniCaricoOnLine";

   public SBNStampeBuoniCarico create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}