# build-docker-image-python

## Build

Please run the following command to build the Docker image.

```
$ docker build . -t docker-image-python-example:v0.1
```

## Run

After you build the Docker image, you can run the following command to run your Docker image.

```
$ docker run docker-image-python-example:v0.1
```

Sample outputs:

```
$ docker run docker-image-python-example:v0.1
{'slideshow': {'author': 'Yours Truly',
               'date': 'date of publication',
               'slides': [{'title': 'Wake up to WonderWidgets!', 'type': 'all'},
                          {'items': ['Why <em>WonderWidgets</em> are great',
                                     'Who <em>buys</em> WonderWidgets'],
                           'title': 'Overview',
                           'type': 'all'}],
               'title': 'Sample Slide Show'}}

```
