import requests
import pprint


if __name__ == '__main__':
    response = requests.get('https://httpbin.org/json')
    pprint.pprint(response.json())
