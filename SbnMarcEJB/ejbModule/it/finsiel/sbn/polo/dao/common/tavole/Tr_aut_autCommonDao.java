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
package it.finsiel.sbn.polo.dao.common.tavole;

import it.finsiel.sbn.exception.InfrastructureException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/*
    DEFAULT <opzionale dipende="XXXtp_legame"> AND tp_legame = XXXtp_legame </opzionale>
    DEFAULT <opzionale dipende="XXXts_var"> AND to_char(ts_var,'yyyymmddhh24miss.FF') = XXXts_var </opzionale>
    DEFAULT <opzionale dipende="XXXvid_base"> AND vid_base = XXXvid_base </opzionale>
    DEFAULT <opzionale dipende="XXXvid_coll"> AND vid_coll = XXXvid_coll </opzionale>
    DEFAULT <opzionale dipende="XXXdata_inizio_inserimento"> AND to_char(ts_ins,'dd/mm/yyyy') &gt;= XXXdata_inizio_inserimento </opzionale>
    DEFAULT <opzionale dipende="XXXdata_fine_inserimento"> AND to_char(ts_ins,'dd/mm/yyyy') &lt;= XXXdata_fine_inserimento </opzionale>
    DEFAULT <opzionale dipende="XXXdata_inizio_variazione"> AND to_char(ts_var,'dd/mm/yyyy') &gt;= XXXdata_inizio_variazione </opzionale>
    DEFAULT <opzionale dipende="XXXdata_fine_variazione"> AND to_char(ts_var,'dd/mm/yyyy') &lt;= XXXdata_fine_variazione </opzionale>

 */

public class Tr_aut_autCommonDao extends TableDao{

	protected boolean kycleslike = false;

    public Tr_aut_autCommonDao() {
        super();
    }
    public void createCriteria(HashMap opzioni) throws InfrastructureException
    {
        try {
            Class cl = Tr_aut_autCommonDao.class;//this.getClass();
            Method[] metodi = cl.getDeclaredMethods();
            for(int index =0; index<metodi.length; index++){
                if(metodi[index].getName().startsWith("set")){
                        metodi[index].invoke(this,new Object[] { opzioni});
                    //log.debug(metodi[index].getName());
                }
            }
            super.createCriteria(opzioni);
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfrastructureException(e);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfrastructureException(e);
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfrastructureException(e);
        }
    }
    public static void main(String[] args) throws Exception{
        Tr_aut_autCommonDao aut = new Tr_aut_autCommonDao();
        aut.createCriteria(new HashMap());
        System.exit(0);
    }
}



