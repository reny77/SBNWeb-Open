/*
 * This class was automatically generated with
 * <a href="http://castor.exolab.org">Castor 0.8.12</a>, using an
 * XML Schema.
 * $Id: Param.java,v 1.1 2011/04/13 14:25:10 almaviva5 Exp $
 */

package org.exolab.castor.mapping.xml;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.DocumentHandler;

/**
 *
 * @version $Revision: 1.1 $ $Date: 2011/04/13 14:25:10 $
**/
public class Param implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _name;

    private java.lang.String _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public Param() {
        super();
    } //-- org.exolab.castor.mapping.xml.Param()


      //-----------/
     //- Methods -/
    //-----------/

    /**
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName()

    /**
    **/
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue()

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid()

    /**
     *
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {

        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer)

    /**
     *
     * @param handler
    **/
    public void marshal(org.xml.sax.DocumentHandler handler)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {

        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.DocumentHandler)

    /**
     *
     * @param _name
    **/
    public void setName(java.lang.String _name)
    {
        this._name = _name;
    } //-- void setName(java.lang.String)

    /**
     *
     * @param _value
    **/
    public void setValue(java.lang.String _value)
    {
        this._value = _value;
    } //-- void setValue(java.lang.String)

    /**
     *
     * @param reader
    **/
    public static org.exolab.castor.mapping.xml.Param unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.exolab.castor.mapping.xml.Param) Unmarshaller.unmarshal(org.exolab.castor.mapping.xml.Param.class, reader);
    } //-- org.exolab.castor.mapping.xml.Param unmarshal(java.io.Reader)

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        Validator validator = new Validator();
        validator.validate(this);
    } //-- void validate()

}
