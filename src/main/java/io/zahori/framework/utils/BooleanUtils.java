package io.zahori.framework.utils;

/*-
 * #%L
 * zahori-framework
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2021 PANEL SISTEMAS INFORMATICOS,S.L
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

import org.apache.commons.lang3.StringUtils;

public class BooleanUtils {

    private BooleanUtils() {
    }

    public static boolean getBoolean(String value) {

        if (value != null) {
            value = StringUtils.trim(value);
        }

        return ("1".equalsIgnoreCase(value) || "y".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value)
                || "true".equalsIgnoreCase(value) || "on".equalsIgnoreCase(value) || "t".equalsIgnoreCase(value)
                || "s".equalsIgnoreCase(value) || "si".equalsIgnoreCase(value) || "sí".equalsIgnoreCase(value));
    }
}
