#!/bin/bash

echo "Digite o usuário!"
read username
echo "Digite o email"
read email
git config --global user.name $username
git config --global user.email $email
echo "Logando![...]"; sleep 1;
