package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.NodeRole;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class NodeRoleEvent extends EntityWebhookEvent<NodeRole> {

    private NodeRole data;

    @Override
    public NodeRole getData() {
        return data;
    }

}
