FROM ubuntu:20.04

RUN apt-get -qq update && apt-get -qq -y install \
    python3 \
    python3-pip \
    && rm -rf /var/lib/apt/lists/*

RUN pip3 install \
    pytest \
    pytest-cov
