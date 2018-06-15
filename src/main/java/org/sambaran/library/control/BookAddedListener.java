package org.sambaran.library.control;

import org.sambaran.library.model.BookAdded;

import javax.enterprise.event.Observes;

public class BookAddedListener {
    public void onBookAddition(@Observes BookAdded added) {
        System.out.printf("Id %d Book %s added to the repository", added.getId(), added.getIdentifier());
    }
}
