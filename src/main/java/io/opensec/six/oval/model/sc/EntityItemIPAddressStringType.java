/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.common.DatatypeEnumeration;



/**
 * The EntityItemIPAddressStringType type is extended by the entities of an individual item.
 * This specific type describes any IPv4/IPv6 address, address prefix, or its string representation.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemIPAddressStringType
    extends EntityItemSimpleBaseType
{

//    public static final DatatypeEnumeration  DEFAULT_DATATYPE = DatatypeEnumeration.STRING;
    //{optional, default="string"}



    /**
     * Constructor.
     */
    public EntityItemIPAddressStringType()
    {
    }


    public EntityItemIPAddressStringType(
                    final String content
                    )
    {
        super( content );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        if (datatype != null) {
            if (datatype == DatatypeEnumeration.IPV4_ADDRESS
                            ||  datatype == DatatypeEnumeration.IPV6_ADDRESS
                            ||  datatype == DatatypeEnumeration.STRING
                            ) {
                // xsd:restriction satisfied.
            } else {
                throw new IllegalArgumentException( "invalid datatype: " + datatype);
            }
        }

        super.setDatatype( datatype );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemIPAddressStringType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//EntityItemIPAddressStringType
