/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.nullcheck;

/**
 * @author Sjaak Derksen
 */
public class NullObjectMapper {

    public String toNullString(NullObject in) {
        return in.toString();
    }
}
