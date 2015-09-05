# Grails 3 on Heroku Example

This is a sample Grails 3 web application but modified a little to be able 
to generate a runnable war that can run at [Heroku](http://www.heroku.com).

Steps:

```
$ git clone <this repo>
$ heroku create
$ heroku addons:create heroku-postgresql
$ git push heroku master
```

NOTE: You may find that this app fails to start up with in the 60 second
boot timeout limit imposed by Heroku. If that's the case, please contact
[Heroku Support](http://help.heroku.com).

After a succesful deploy (remote build and run), the webapp will run at URL: 
https://<app-name>.herokuapp.com

To check what happens in remote, use for example this command:

```
$ heroku logs --tail
```


Note:

You can work and run with this project in the usual way (run for example with grails run-app), 
but to do a test build for generating a war compatible with Heroku use

```
$ gradle stage
```

and then you can run it in local but in the same way of the Heroku environment with:

```
$ heroku local
```

To make changes and put in the app "live", remember to commit them and push to heroku.


