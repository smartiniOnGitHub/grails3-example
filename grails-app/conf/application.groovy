// Note that all contents of this file will be merged with application.groovy that wins and overrides application.yml, so remember to remove the same settings in the other (main) file for the same environment, or use only one of these two files

environments {
/*
// ok, but due to a Grails issue it's better to move this setting in application.yml,
// but find a way to pass the value of the desired env var inside it
    production {
        dataSource {
            dbCreate = "update"
            driverClassName = "org.postgresql.Driver"
            dialect = org.hibernate.dialect.PostgreSQLDialect
            uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
            url = "jdbc:postgresql://" + uri.host + ":" + uri.port + uri.path + "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
            username = uri.userInfo.split(":")[0]
            password = uri.userInfo.split(":")[1]
        }
        grails {
            mongodb {
                // use an environment variable containing all the connection string if defined, otherwise a default will be used instead
                connectionString = System.env.MONGODB_URI ?: "mongodb://127.0.0.1/test"
                options {
                    autoConnectRetry = true
                    connectTimeout   = 300
                    maxWaitTime      = 120000
                    socketTimeout    = 0
                    socketKeepAlive  = false
                    writeNumer       = 0
                    writeTimeout     = 0
                    writeFsync       = false
                }
            }
    }
 */

}
