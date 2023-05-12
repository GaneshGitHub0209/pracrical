<web-app>
    <servlet>
        <servlet-name>AccessCounterServlet</servlet-name>
        <servlet-class>com.example.AccessCounterServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>AccessCounterServlet</servlet-name>
        <url-pattern>/access-counter</url-pattern>
    </servlet-mapping>
</web-app>