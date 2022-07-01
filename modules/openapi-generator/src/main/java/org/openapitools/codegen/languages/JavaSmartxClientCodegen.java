/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.languages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaSmartxClientCodegen extends JavaClientCodegen {
  private final Logger LOGGER = LoggerFactory.getLogger(JavaSmartxClientCodegen.class);

  // what has changed:
  // use byte[] as file type for the sake of slicing
  public JavaSmartxClientCodegen() {
    super();
    embeddedTemplateDir = templateDir = "Java";
    typeMapping.put("file", "byte[]");
    typeMapping.put("binary", "byte[]");
  }

  @Override
  public String getName() {
    return "java-smartx";
  }
}
