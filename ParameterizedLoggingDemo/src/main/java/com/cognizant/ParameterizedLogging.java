package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String userName = "Yashaswi";
        int booksIssued = 5;

        logger.info("User {} has issued {} books.", userName, booksIssued);

        logger.warn("User {} has only {} books remaining before reaching the limit.", userName, 2);

        logger.error("User {} could not issue more books.", userName);
    }
}
