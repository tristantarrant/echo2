/* 
 * This file is part of the Echo Web Application Framework (hereinafter "Echo").
 * Copyright (C) 2002-2005 NextApp, Inc.
 *
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 */

package nextapp.echo2.testapp.interactive;

import nextapp.echo2.app.FillImage;
import nextapp.echo2.app.ResourceImageReference;
import nextapp.echo2.app.StyleSheet;
import nextapp.echo2.app.componentxml.ComponentXmlException;
import nextapp.echo2.app.componentxml.StyleSheetLoader;

/**
 * 
 */
public class Styles {

    public static final FillImage BG_NW_SHADOW = new FillImage(new ResourceImageReference(
            "/nextapp/echo2/testapp/interactive/bg_nw_shadow.png"), null, null, FillImage.NO_REPEAT, 
            FillImage.ATTACHMENT_FIXED);
    
    public static final ResourceImageReference ICON_LOGO = 
            new ResourceImageReference("/nextapp/echo2/testapp/interactive/nextapp_logo.png");

    public static final String APPLICATION_CONTROLS_COLUMN_STYLE_NAME = "applicationControlsColumn";
    public static final String DEFAULT_STYLE_NAME = "default";
    public static final String SELECTED_BUTTON_STYLE_NAME = "selectedButton";
    public static final String TEST_CONTROLS_COLUMN_STYLE_NAME = "testControlsColumn";
    public static final String TITLE_LABEL_STYLE_NAME = "titleLabel";

    public static final StyleSheet DEFAULT_STYLE_SHEET;
    public static final StyleSheet GREEN_STYLE_SHEET;
    static {
        try {
            DEFAULT_STYLE_SHEET = StyleSheetLoader.load("nextapp/echo2/testapp/interactive/Default.stylesheet", 
                    Thread.currentThread().getContextClassLoader());
            GREEN_STYLE_SHEET = StyleSheetLoader.load("nextapp/echo2/testapp/interactive/Green.stylesheet", 
                    Thread.currentThread().getContextClassLoader());
        } catch (ComponentXmlException ex) {
            throw new RuntimeException(ex);
        }
    }
}
