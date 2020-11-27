let argv = process.argv;

process.stdout.write("Hello,");

if (process.argv.length > 2)
  for (let i = 2; i < argv.length; ++i)
    process.stdout.write(
      ` ${argv[i].charAt(0).toUpperCase() + argv[i].slice(1)}`
    );
else process.stdout.write(" World");

console.log("!");
