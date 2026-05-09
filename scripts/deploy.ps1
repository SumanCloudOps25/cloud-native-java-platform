kubectl apply -f k8s/base/

kubectl rollout restart deployment java-app -n java-app

kubectl rollout status deployment java-app -n java-app

kubectl get pods -n java-app