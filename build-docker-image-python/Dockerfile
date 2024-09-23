FROM python:3.12.6

COPY ["requirements.txt", "/code/"]
RUN pip3 install -r /code/requirements.txt

COPY ["src/*.py", "/code/"]

CMD ["python3", "/code/main.py"]
