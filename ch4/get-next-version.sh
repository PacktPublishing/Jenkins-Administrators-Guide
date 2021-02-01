#!/bin/bash
set -e

next_version=$(git tag | egrep '^[0-9]\.[0-9]+\.[0-9]+$' | sort --version-sort | tail -1 | awk -F . '{print $1 "." $2+1 "." $3}')

if [ -z "${next_version}" ]; then
    next_version='0.1.0'
fi

echo ${next_version}
