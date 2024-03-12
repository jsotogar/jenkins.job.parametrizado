#!/bin/bash
echo "Welcome to planet $planet"
if [ "$agent" = "true" ]
then
  echo "Get ready for your mission agent X, may the force be with you."
else
  echo "Enjoy the planet human $name, try not to get killed."
fi
echo "..."
sleep 3
echo "Good luck! You'll need it"
