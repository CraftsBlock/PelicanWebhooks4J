package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Node;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class NodeEvent extends EntityWebhookEvent<Node> {

    private Node data;

    @Override
    public Node getData() {
        return data;
    }

}
