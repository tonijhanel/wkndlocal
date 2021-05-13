/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customheaderlibs_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_currentpage = bindings.get("currentpage");
Object _global_clientlib = null;
out.write("\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n<link rel=\"canonical\"");
{
    String var_attrcontent0 = ("https://wknd.site" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "path"), obj().with("extension", "html")), "uri")));
    {
        Object var_shoulddisplayattr1 = ((renderContext.getObjectModel().toBoolean(var_attrcontent0) ? var_attrcontent0 : ("false".equals(var_attrcontent0))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr1)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent0));
            out.write("\"");
        }
    }
}
out.write("/>\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions3_field$_categories = "wknd.base";
        {
            java.util.Map var_templateoptions3 = obj().with("categories", var_templateoptions3_field$_categories);
            callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
        }
    }
}
out.write("\n\n\n\n\n<meta name=\"theme-color\" content=\"#FFEA00\"/>\n<link rel=\"manifest\" href=\"/etc.clientlibs/wknd/clientlibs/clientlib-site/resources/manifest.json\"/>\n\n\n");
{
    Object var_includedresult4 = renderContext.call("include", "favicons.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult4));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

