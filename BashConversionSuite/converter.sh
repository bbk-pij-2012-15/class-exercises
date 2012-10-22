#!/bin/bash

echo "What would you like to convert? [temp/bases/money;]"

read resp

if [ $resp == temp ]; then
	exec ./converters/temp_converter
elif [ $resp == bases ]; then
	exec ./converters/base_converter
elif [ $resp == money ]; then
	exec ./converters/currency_converter
else echo "Please specify either 'temp', 'bases' or 'money'" && exec ./converter.sh
fi
