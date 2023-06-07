package com.company.rest.api;




import com.company.model.Claim2
import groovy.json.JsonBuilder
import groovy.sql.Sql

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.apache.http.HttpHeaders
import org.bonitasoft.web.extension.ResourceProvider
import org.bonitasoft.web.extension.rest.RestApiResponse
import org.bonitasoft.web.extension.rest.RestApiResponseBuilder

import org.h2.jdbcx.JdbcConnectionPool

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import org.bonitasoft.web.extension.rest.RestAPIContext
import org.bonitasoft.web.extension.rest.RestApiController

import java.time.LocalDate


class Index implements RestApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(Index.class)

	private Connection conn;
	private Statement stmt;
	
    @Override
    RestApiResponse doHandle(HttpServletRequest request, RestApiResponseBuilder responseBuilder, RestAPIContext context) {
		
		
		LOGGER.info("Connecting to database... punto 1");
		// STEP 1: Register JDBC driver
		Class.forName("org.h2.Driver");
		LOGGER.info("Connecting to database... punto 2");
		LOGGER.info("Connecting to database... punto 2.1");
		conn = DriverManager.getConnection("jdbc:h2:file:C:/BonitaStudioCommunity-2021.1/workspace/Mi Proyecto/h2_database/business_data.db","sa","");
		LOGGER.info("Connecting to database... punto 3");
		stmt = conn.createStatement();
		LOGGER.info("Connecting to database... punto 4");
		String sql = "select * from claim2"
		stmt.execute(sql);
		LOGGER.info("Connecting to database... punto 5");
        conn.close()
        
	
		
		
		def result = ["id": 2, "texto": "hola"]
		
		return buildResponse(responseBuilder, HttpServletResponse.SC_OK, new JsonBuilder(result).toString())
		
		
    }

    /**
     * Build an HTTP response.
     *
     * @param  responseBuilder the Rest API response builder
     * @param  httpStatus the status of the response
     * @param  body the response body
     * @return a RestAPIResponse
     */
    RestApiResponse buildResponse(RestApiResponseBuilder responseBuilder, int httpStatus, Serializable body) {
        return responseBuilder.with {
            withResponseStatus(httpStatus)
            withResponse(body)
            build()
        }
    }

    /**
     * Returns a paged result like Bonita BPM REST APIs.
     * Build a response with a content-range.
     *
     * @param  responseBuilder the Rest API response builder
     * @param  body the response body
     * @param  p the page index
     * @param  c the number of result per page
     * @param  total the total number of results
     * @return a RestAPIResponse
     */
    RestApiResponse buildPagedResponse(RestApiResponseBuilder responseBuilder, Serializable body, int p, int c, long total) {
        return responseBuilder.with {
            withContentRange(p,c,total)
            withResponse(body)
            build()
        }
    }

    /**
     * Load a property file into a java.util.Properties
     */
    Properties loadProperties(String fileName, ResourceProvider resourceProvider) {
        Properties props = new Properties()
        resourceProvider.getResourceAsStream(fileName).withStream { InputStream s ->
            props.load s
        }
        props
    }

}
