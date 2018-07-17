/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.incubator.client.infinitescroll.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
//@formatter:off

/**
 * @author kevzlou7979
 */
public class EndEvent extends GwtEvent<EndEvent.EndHandler> {

    public static final Type<EndHandler> TYPE = new Type<>();

    public EndEvent() {}

    public static Type<EndHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source) {
        source.fireEvent(new EndEvent());
    }

    @Override
    public Type<EndHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(EndHandler handler) {
        handler.onEnd(this);
    }

    public interface EndHandler extends EventHandler {
        void onEnd(EndEvent event);
    }
}
