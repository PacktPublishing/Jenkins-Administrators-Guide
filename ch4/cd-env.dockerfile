FROM ubuntu:20.04
RUN apt-get -qq update -y && \
    apt-get -qq install -y curl \
    && rm -rf /var/lib/apt/lists/*
RUN curl -fsSL https://get.docker.com | sh
