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
/*
 * TrRepMar.h
 *
 *  Created on: 29-mar-2010
 *      Author: Arge
 */


#ifndef TRREPMAR_H_
#define TRREPMAR_H_

#include "Tb.h"

class TrRepMar: public Tb {
public:
	enum tRepMarId {
		progr_repertorio,
		mid,
		id_repertorio,
		nota_rep_mar,
		ute_ins,
		ts_ins,
		ute_var,
		ts_var,
		fl_canc
	};

	TrRepMar(CFile *tbIn, CFile *tbOffsetIn, char *offsetBufferTbPtr, long elementsTb, int keyPlusOffsetPlusLfLength, int key_length);
	bool loadNextRecord(const char *key);
	virtual ~TrRepMar();
};

#endif /* TRREPMAR_H_ */
