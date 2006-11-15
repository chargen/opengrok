/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright 2005 Trond Norbye.  All rights reserved.
 * Use is subject to license terms.
 */
package org.opensolaris.opengrok.search.scope.editor;

import java.io.FileReader;
import org.opensolaris.opengrok.search.scope.Editor;
import org.opensolaris.opengrok.search.scope.editor.EditorFrame;


/**
 * The InternaEditor is used to open a file in a JFrame.
 *
 * @author Trond Norbye
 */
public class InternalEditor extends Editor {
    /**
     * Creates a new instance of InternalEditor
     */
    public InternalEditor() {
        super();
    }

    /**
     * Display a named file in the editor
     *
     * @param filename The name of the file to display
     * @param lineno The line number to position the caret at (null if unknown)
     *
     * @throws java.lang.Exception if an error occurs while starting the editor
     *         or reading the file
     */
    public void displayFile(String filename, Integer lineno)
        throws Exception {
        EditorFrame editor = new EditorFrame();
        editor.openFile(filename, new FileReader(filename), lineno);
        editor.setVisible(true);
    }

    /**
     * Is it possible to modify the command on this editor or not
     *
     * @return true if the user is able to modify the command used to start
     *         this editor or not
     */
    public boolean isEditable() {
        return false;
    }
}
