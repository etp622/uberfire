package org.uberfire.annotations.processors;

import org.uberfire.client.annotations.Perspective;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.workbench.model.PerspectiveDefinition;
import org.uberfire.security.annotations.All;
import org.uberfire.security.annotations.Roles;

@WorkbenchPerspective(identifier = "PerspectiveTest5", isDefault = true)
public class PerspectiveTest5 {

    @Perspective
    @All
    @Roles({"ADMIN", "SUDO"})
    public PerspectiveDefinition getPerspective() {
        return null;
    }

}
