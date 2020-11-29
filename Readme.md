# FHIR Observation Outlier Detection

## Overview
This codebase contains two componenets the backend data aggregation service and the abnoraml observation lab result detection Jupyter notebook. 
The backend component connects to the SMART FHIR R4 Resource endpoint and retreives a lis of observation data by lonic code. The steps to run the backend component locally are listed below. The data aggregation component is deployed on Herkou, however due to server utilization this endpoint may not work due to the compute resources required by the data aggregation endpoint. The steps to deploy locally are listed below as well. The Jupyter notebook is deployed on Google CoLab and that's acessiable through the link below.

The Jupyter Notebook explains how abnormal lab results are identified and determines the cut off points by gender for a given lonic code. 

# Backend Data Aggregation Component

## Local Deployment
### Installation
Build Jar File: `./gradlew clean build`
Build Docker Image: `docker build . -t data_agg`

### Running Module
Running Locally: `docker run -p 8080:8080 data_agg`

### Data Aggregation Endpoint Example
http://localhost:8080/fhir/obsevation?lonicCode=72514-3


### Herkou Data Aggregation Backend Deployment Endpoint:
https://kbokka3-cs6440-indvidualprojec.herokuapp.com/fhir/obsevation?lonicCode=6299-2


# Abnormal Obesrvation Lab Result Detection 

## Google CoLab Deploymnet 
CoLab Deployment: https://colab.research.google.com/drive/1xCxbuDzVYEHQqe1wML0cOjrSe6N8Gso4?usp=sharing

If the CoLab link does not work and you have juypter isntalled follow the local deployment instructions

## Local Juypter Notebook Launcher
* Lanuch Juypter Notebook Session: `juypter notebook`
* Open the `individual_project.ipynb` and select run all cells. 



