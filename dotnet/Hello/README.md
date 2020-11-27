# .NET 5 Hello World Example

## Notes

Project was created using

```bash
dotnet new console -o Hello
```

## Run

Run will perform a 'dotnet build' and execute the program

```bash
dotnet run
```

Pass arguments

```bash
dotnet run your name
```

## Publish

This will create a release with all the dependencies

Note: Large file size!!!

```bash
dotnet publish -r linux-x64 -c Release /p:PublishSingleFile=true
```

## Clean build

```bash
dotnet clean
```
