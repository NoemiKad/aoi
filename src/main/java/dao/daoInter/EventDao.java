package dao.daoInter;

import model.Event;

import java.util.Iterator;

public interface EventDao {
    Iterator<Event> showAllEvents();

    boolean saveEvent(Event newEvent);

    boolean delateEvent();
}
