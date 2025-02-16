package com.saga.choreography.common.event;

import java.util.*;

public interface Event {

    UUID getEventId();

    Date getDate();
}
