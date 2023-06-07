package com.company.rest.api;

@GrabConfig(systemClassLoader=true)
@Grab(group='com.h2database', module='h2', version='1.4.199')


import com.company.model.Claim2
import groovy.json.JsonBuilder
import groovy.sql.Sql

import java.sql.*
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

    @Override
    RestApiResponse doHandle(HttpServletRequest request, RestApiResponseBuilder responseBuilder, RestAPIContext context) {
        // To retrieve query parameters use the request.getParameter(..) method.
        // Be careful, parameter values are always returned as String values
		
		/*
        // Retrieve p parameter
        def p = request.getParameter "p"
		p = 1
        if (p == null) {
            return buildResponse(responseBuilder, HttpServletResponse.SC_BAD_REQUEST,"""{"error" : "the parameter p is missing"}""")
        }

        // Retrieve c parameter
        def c = request.getParameter "c"
		c = 2
        if (c == null) {
            return buildResponse(responseBuilder, HttpServletResponse.SC_BAD_REQUEST,"""{"error" : "the parameter c is missing"}""")
        }
		
		// ***** own code start ******
		
		
		// use APIClient to retrieve the CarDAO class:
		def claim2DAO = context.apiClient.getDAO(Claim2.class)
		
		def currentModel = "claim2"
		
		List<Claim2> claim2s = claim2DAO.findByModel(currentModel, p as int, c as int)
		
		
		def claim2Models = [:]
		for (Claim2 claim2 : claim2s) {
			// return the fields "id", "buildYear", "color":
			claim2Models.put("${claim2.description2} - ${claim2.answer2} - ${claim2.satisfactionLevel2}")
		}

		
		
        // Here is an example of how you can retrieve configuration parameters from a properties file
        // It is safe to remove this if no configuration is required
        // Properties props = loadProperties("configuration.properties", context.resourceProvider)
        // String paramValue = props["myParameterKey"]
		
		
		//def result = [ "model" : currentModel, "number of claims" : claim2s.size(), "claims" : claim2Models ]
        
		
		//def result = ["id": 2, "texto": "hola"]
		
		

		
        // ***** own code start ******
		
		
        // def result = [ "p" : p ,"c" : c , "myParameterKey" : paramValue, "currentDate" : LocalDate.now().toString() ]

        // Send the result as a JSON representation
        // You may use buildPagedResponse if your result is multiple
        return buildResponse(responseBuilder, HttpServletResponse.SC_OK, new JsonBuilder(result).toString())
        
        */
		
		Connection conn = DriverManager.getConnection("jdbc:h2:~/bomt", "sa", "");
		// add application code here
		Statement stat = conn.createStatement();
		ResultSet rs;
		rs = stat.executeQuery("select * from claim2");
		
		while (rs.next()) {
			System.out.println(rs.getString("description2"));
		}
		conn.close();
		
		
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
