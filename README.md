# text-checkbox
Android Simple Text Checkbox

#### Installation

```
git submodule add https://github.com/diewland/text-checkbox.git app/src/main/java/com/diewland/tcheckbox
git submodule update --init --recursive
```

#### Update submodule

```
git submodule update --remote --recursive
```

#### Remove submodule

```
# Remove the submodule entry from .git/config
git submodule deinit -f path/to/submodule

# Remove the submodule directory from the superproject's .git/modules directory
rm -rf .git/modules/path/to/submodule

# Remove the entry in .gitmodules and remove the submodule directory located at path/to/submodule
git rm -f path/to/submodule
```
https://stackoverflow.com/a/36593218/466693
