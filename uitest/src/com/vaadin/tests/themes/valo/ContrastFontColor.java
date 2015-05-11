/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.themes.valo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractTestUI;
import com.vaadin.ui.TextField;

/**
 * Test UI for default contrast color value.
 * 
 * @author Vaadin Ltd
 */
@Theme("tests-valo-contrast")
public class ContrastFontColor extends AbstractTestUI {

    @Override
    protected void setup(VaadinRequest request) {
        TextField field = new TextField();
        addComponent(field);
    }

    @Override
    protected Integer getTicketNumber() {
        return 14793;
    }

    @Override
    protected String getTestDescription() {
        return "Provide a variable for default contrast value in valo-font-color function.";
    }

}