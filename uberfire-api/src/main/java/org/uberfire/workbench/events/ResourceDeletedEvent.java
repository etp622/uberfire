package org.uberfire.workbench.events;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.backend.vfs.Path;
import org.uberfire.rpc.SessionInfo;

import static org.kie.commons.validation.PortablePreconditions.*;

/**
 * An Event indicating a Resource has been deleted
 */
@Portable
public class ResourceDeletedEvent {

    private Path path;
    private SessionInfo sessionInfo;

    public ResourceDeletedEvent() {
        //Empty constructor for Errai marshalling
    }

    public ResourceDeletedEvent( final Path path,
                                 final SessionInfo sessionInfo ) {
        this.path = checkNotNull( "path", path );
        this.sessionInfo = checkNotNull( "executedBy", sessionInfo );
    }

    public Path getPath() {
        return this.path;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }
}
