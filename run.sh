#!/bin/bash
git pull

echo "Running Maven clean and package..."
mvn clean package

echo "Starting Docker containers..."
docker-compose up -d --build

sleep 5

echo "Checking status of containers..."
docker-compose ps
