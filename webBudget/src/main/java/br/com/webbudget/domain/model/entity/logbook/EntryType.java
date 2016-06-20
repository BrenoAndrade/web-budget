/*
 * Copyright (C) 2016 Arthur Gregorio, AG.Software
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.webbudget.domain.model.entity.logbook;

/**
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 2.3.0, 15/05/2014
 */
public enum EntryType {

    TAXES("entry-type.taxes"),
    PARTS("entry-type.parts"),
    OTHERS("entry-type.others"),
    SERVICES("entry-type.services"),
    REFUELING("entry-type.refueling"),
    INSURANCE("entry-type.insurance"),
    MAINTENANCES("entry-type.maintenances");

    private final String description;

    /**
     *
     * @param description
     */
    private EntryType(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.description;
    }
}