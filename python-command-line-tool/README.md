# Python Command-line Tools

There are 2 examples here.


## greeting

This example is for demonstrating the various common usages for `add_argument()`.

You can try it with the following commands:

```
$ ./greeting John
Hello, John.
$ ./greeting --loud John
HELLO, JOHN.
$ ./greeting --times 3 John
Hello, John.
Hello, John.
Hello, John.
$ ./greeting --mode question John
Hello, John?
$ ./greeting --mode exclaim John
Hello, John!
$ ./greeting --prefix Oh --prefix Hey John
Oh. Hey. Hello, John.
$ ./greeting --verbose John
DEBUG: check args done
DEBUG: begin to print
Hello, John.
DEBUG: shutting down
```


## calculate

This example is for demonstrating `add_subparsers()`.

You can try it with the following commands:

```
$ ./calculate add 5 3
8
$ ./calculate minus 5 3
2
$ ./calculate square 8
64
```
