FROM ubuntu:focal
RUN apt-get -qq update -y && apt-get -qq install -y curl
RUN curl -fsSL https://get.docker.com | sh

