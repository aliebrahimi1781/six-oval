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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.definitions.EntityMap;



/**
 * The Windows registry properties.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegistryProperty
{

    public enum Entity
    {
    HIVE,   //RegistryHive
    KEY,    //String
    NAME,   //String
    TYPE,   //RegistryType
    VALUE;  //AnySimple
    }


    /**
     */
    public static EntityMap<RegistryProperty.Entity> createEntityMap()
    {
        return (new EntityMap<RegistryProperty.Entity>());
    }

}
//