This is a few basic samples of using twirl templates (.scala.html files found in the views package).

The first most basic example `name`, it will take two url parameters (:firstName, :lastName) and display them on the page when loaded.

The second example `people` will accept a list of the model `Person` and format the page using scala code inside the .scala.html file. It also makes use of a custom `partial`. `JobDetails` is considered a `partial` because it doesn't contain code to create an entire webpage, rather it can create a single element, which we then reference in the `people` view on line 18.

To test the above you can run the project (`sbt run` (defaults to port 9000) or `sbt "run PORTNUMBERHERE"`) and navigate in your browser to `localhost:PORTNUMBERHERE/:firstName/:lastName` changing `:firstName` and `:lastName` as you wish, and `localhost:PORTNUMBERHERE/people`.

If you look in the model you will notice `Person` has some data elements that are not shown on the `people` view. To get familiar, try adding more of the data elements to the existing view.