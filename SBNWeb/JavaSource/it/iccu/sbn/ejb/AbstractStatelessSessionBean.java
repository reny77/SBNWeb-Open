/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package it.iccu.sbn.ejb;

import it.iccu.sbn.servizi.ticket.TicketChecker;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import org.apache.log4j.Logger;

public abstract class AbstractStatelessSessionBean extends TicketChecker implements SessionBean {


	private static final long serialVersionUID = -227508004672945721L;

	protected static Logger logger = Logger.getLogger(AbstractStatelessSessionBean.class);

    protected SessionContext context;

    public void ejbActivate() throws EJBException, RemoteException {
    	return;
    }

    public void ejbPassivate() throws EJBException, RemoteException {
    	return;
    }

    public void ejbRemove() throws EJBException, RemoteException {
    	return;
    }

    public void setSessionContext(SessionContext context) throws EJBException,
            RemoteException {
        this.context = context;
    }

    public void ejbCreate() {
        logger.info("creato ejb");
    }

    public boolean isAuthorized(String ticket, String codiceFunzione) {
        return true;
    }
}
