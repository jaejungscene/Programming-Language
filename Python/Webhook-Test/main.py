

from flask import Flask, request, abort

app = Flask(__name__)

@app.route('/webhookcallback', methods=['POST'])
def hook():
    print(request.data)
    return "Hello World"

if __name__ == '__main__':
    app.run()