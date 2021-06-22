FROM jenkins/jenkins:2.263.1-lts
USER root
RUN  usermod -u 123 -g 30 jenkins
USER jenkins

