/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.addins.client.overlay;

import gwt.material.design.addins.client.MaterialAddins;
import gwt.material.design.addins.client.dark.AddinsWidgetDarkTheme;

public class MaterialOverlayDarkTheme extends AddinsWidgetDarkTheme {

    public MaterialOverlayDarkTheme() {
        super(MaterialAddins.isDebug() ? MaterialOverlayDebugClientBundle.INSTANCE.overlayDarkCss() : MaterialOverlayClientBundle.INSTANCE.overlayDarkCss());
    }
}