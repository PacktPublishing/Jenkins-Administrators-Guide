FROM python:3
COPY adder.py /
ENTRYPOINT ["python", "/adder.py"]

